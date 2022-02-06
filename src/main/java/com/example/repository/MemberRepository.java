package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.Member;

@Repository
public class MemberRepository {

	@Autowired
	private NamedParameterJdbcTemplate template;
	
	private static final RowMapper<Member> MEMBER_ROW_MAPPER = (rs,i) -> {
		Member member = new Member();
		member.setName(rs.getString("name"));
		return member;
	};
	
	public List<Member> findName(String name) {
		String sql = "select name from members where name like :name";
		SqlParameterSource param = new MapSqlParameterSource().addValue("name", "%" + name + "%");
		List<Member> members = template.query(sql, param, MEMBER_ROW_MAPPER);
		return members;
	}
	
}
