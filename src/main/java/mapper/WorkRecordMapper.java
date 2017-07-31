package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import po.WorkRecord;
import po.WorkRecordExample;

public interface WorkRecordMapper {
    int countByExample(WorkRecordExample example);

    int deleteByExample(WorkRecordExample example);

    int deleteByPrimaryKey(Long wId);

    int insert(WorkRecord record);

    int insertSelective(WorkRecord record);

    List<WorkRecord> selectByExample(WorkRecordExample example);

    WorkRecord selectByPrimaryKey(Long wId);

    int updateByExampleSelective(@Param("record") WorkRecord record, @Param("example") WorkRecordExample example);

    int updateByExample(@Param("record") WorkRecord record, @Param("example") WorkRecordExample example);

    int updateByPrimaryKeySelective(WorkRecord record);

    int updateByPrimaryKey(WorkRecord record);
}