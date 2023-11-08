package com.ltg.order.test;

import com.ltg.base.course.data.dto.ChooseCourseDto;
import com.ltg.base.course.data.vo.CourseOrderDetailVo;
import com.ltg.base.course.entity.CourseOrder;
import com.ltg.base.course.service.CourseOrderService;
import com.ltg.base.sys.data.response.CurrentUserHolder;
import com.ltg.base.sys.data.response.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * @Version 1.0
 * @Author LTG
 * @ClassName TestLogin
 * @Date 2023/10/28 15:20
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestOrder {
    
    @Autowired
    private CourseOrderService courseOrderService;
    @Test
    public void testOrderDetail() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(1L);
        CurrentUserHolder.setCurrentUser(userInfo);
        CourseOrderDetailVo courseOrderDetailVo = courseOrderService.orderDetail(1L);
        assertEquals("1",courseOrderDetailVo.getId().toString());
    }
    
    @Test
    public void testChooseCourse() {
        ChooseCourseDto chooseCourseDto = new ChooseCourseDto();
        chooseCourseDto.setCourseId(1L);
        UserInfo userInfo = new UserInfo();
        userInfo.setId(1L);
        CurrentUserHolder.setCurrentUser(userInfo);
        CourseOrder courseOrder = courseOrderService.chooseCourse(chooseCourseDto);
        assertEquals("1",courseOrder.getCourseId().toString());
    }
}
