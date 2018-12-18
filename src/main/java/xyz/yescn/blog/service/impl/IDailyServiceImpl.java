package xyz.yescn.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.yescn.blog.dao.DailyMapper;
import xyz.yescn.blog.domain.Daily;
import xyz.yescn.blog.dto.DailyDto;
import xyz.yescn.blog.service.IDailyService;

import java.util.List;


/**
 * @author issuser
 */
@Service("dailyService")
public class IDailyServiceImpl implements IDailyService {
    @Autowired
    private DailyMapper dailyMapper;
    @Override
    public DailyDto getDailyById(Long id) {
        return getDailyDtoFromDaily(dailyMapper.getDailyById(id));
    }

    @Override
    public void insertDaily(DailyDto dailyDto) {
        dailyMapper.insertDaily(dailyDto);
    }

    @Override
    public void updateDaily(DailyDto dailyDto) {
        dailyMapper.updateDaily(dailyDto);
    }

    @Override
    public void deleteDaily(Long id) {
        dailyMapper.deleteDaily(id);
    }

    @Override
    public List<DailyDto> getDailyList() {
        return null;
    }

    /**
     * 日志对象封装DailyDto
     * @param daily
     * @return
     */
    private DailyDto getDailyDtoFromDaily(Daily daily){
        DailyDto dailyDto = new DailyDto();
        dailyDto.setId(daily.getId());
        dailyDto.setTitle(daily.getTitle());
        dailyDto.setContent(daily.getContent());
        dailyDto.setCreateTime(daily.getCreateTime());
        return dailyDto;
    }
}