/**
 * FileName: LogTestController
 * Author:   李鑫
 * Date:     2020/4/10 11:06
 * Description: 测试log的打印深度
 */
package com.lixin.controller.TestLog;

import com.alibaba.fastjson.JSON;
import com.lixin.model.TestLog.Person;
import com.lixin.model.TestLog.Student;
import com.lixin.model.TestLog.Teacher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogTestController {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/testlog")
    public Student testLog(){
        Student student = new Student();
        student.setClassName("计算机一班");
        student.setAge(18);
        student.setName("李鑫");
        Teacher teacher = new Teacher();
        teacher.setAge(32);
        teacher.setName("王老师");
        student.setTeacher(teacher);
        log.info("当前的学生是[{}]", JSON.toJSON(student));
        return  student;
    }
}
