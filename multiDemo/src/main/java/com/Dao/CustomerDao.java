package com.Dao;

import com.enty.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.mapping.ResultSetType;
import org.apache.ibatis.session.ResultHandler;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CustomerDao {
    Customer selectCustomer(Integer id);

    Integer insertCustomer(Customer c);

    void txtest();

    Integer test1();

    int size();

    List<Customer> t1(@Param("size") int size, @Param("offset") long offset);
    List<Customer> t11(@Param("size") int size, @Param("offset") long offset);
    List<Customer> t12(@Param("size") int size, @Param("offset") long offset);

    @Options(resultSetType = ResultSetType.FORWARD_ONLY, fetchSize = 2000)
    Cursor<Customer> t2();

    @Options(resultSetType = ResultSetType.FORWARD_ONLY, fetchSize = Integer.MIN_VALUE)
    void t3(ResultHandler<Customer> userResultHandler);

    Integer insertCustomer2(@Param("list") List<Customer> list);

    //流式查询
    @Options(resultSetType = ResultSetType.FORWARD_ONLY, fetchSize = Integer.MIN_VALUE)
    void test6(ResultHandler<Customer> userResultHandler);

    Customer checkDBRecord(Integer id);
}
