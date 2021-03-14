package sml.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data  //get set方法
@AllArgsConstructor  // 全参构造器
@NoArgsConstructor   // 无参构造器
@ToString  // toString方法
public class User {

    private String userName;


}
