package com.lixin.testweb.beanLife;


/*@Component*/
/*
public class StudentBean implements BeanPostProcessor, BeanNameAware {


    private String name;

    public StudentBean() {
        System.out.println("========>构造函数 StudentBean");
    }


    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName" + name);
    }

    public void setName(String name) {
        System.out.println("设置对象属性setName()..");
        this.name = name;
    }

    @PostConstruct
    public void initStudent() {
        System.out.println("initStudent ");
    }

    @PreDestroy
    public void destoryStudent() {
        System.out.println("destoryStudent");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("person")) {
            Person person = (Person) bean;
            if (person.objectMapper != null) {
                System.out.println("postProcessBeforeInitialization");
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //System.out.println(beanName);
        if (beanName.equals("person")) {
            Person person = (Person) bean;
            System.out.println("设置person的属性");
            if (person.objectMapper==null){
                System.out.println("person的属性不存在");
            }
        }
        return bean;
    }
}
*/
