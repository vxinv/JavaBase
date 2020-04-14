/**
 * FileName: Student
 * Author:   李鑫
 * Date:     2020/4/10 11:03
 * Description: 测试log
 */
package com.lixin.model.TestLog;

import lombok.Data;

@Data
public class Student extends Person{
    String className;
    Teacher teacher;
}
