package dal.dao;

import dal.model.OrderManager;

public interface OrderManagerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderManager record);

    int insertSelective(OrderManager record);

    OrderManager selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderManager record);

    int updateByPrimaryKeyWithBLOBs(OrderManager record);

    int updateByPrimaryKey(OrderManager record);
}