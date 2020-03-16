package com.lixin.typehandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.*;
import java.time.format.DateTimeFormatter;

@MappedJdbcTypes({JdbcType.TIMESTAMP})
@MappedTypes({String.class})

public class FormatTimeTypeHandler implements TypeHandler<String> {


    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public void setParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
            ps.setString(i,parameter);
    }

    @Override
    public String getResult(ResultSet rs, String columnName) throws SQLException {
        Timestamp timestamp = rs.getTimestamp(columnName);
        return timestamp.toLocalDateTime().format(formatter);
    }

    @Override
    public String getResult(ResultSet rs, int columnIndex) throws SQLException {
        Timestamp timestamp = rs.getTimestamp(columnIndex);
        return timestamp.toLocalDateTime().format(formatter);
    }

    @Override
    public String getResult(CallableStatement cs, int columnIndex) throws SQLException {
        Timestamp timestamp = cs.getTimestamp(columnIndex);
        return timestamp.toLocalDateTime().format(formatter);
    }
}
