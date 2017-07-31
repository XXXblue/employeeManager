package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import po.Development;
import po.DevelopmentExample;

public interface DevelopmentMapper {
    int countByExample(DevelopmentExample example);

    int deleteByExample(DevelopmentExample example);

    int deleteByPrimaryKey(Long dNo);

    int insert(Development record);

    int insertSelective(Development record);

    List<Development> selectByExample(DevelopmentExample example);

    Development selectByPrimaryKey(Long dNo);

    int updateByExampleSelective(@Param("record") Development record, @Param("example") DevelopmentExample example);

    int updateByExample(@Param("record") Development record, @Param("example") DevelopmentExample example);

    int updateByPrimaryKeySelective(Development record);

    int updateByPrimaryKey(Development record);
}