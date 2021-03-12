package sml.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * 只有在容器中的组件才会拥有SpringBoot强大的功能
 */
//@Component
//该注解加载properties中的文件注入到属性中(只有自动注入autowired，或从容器中获取的才会注入)
//如果不写@Component将该组件加入到容器中，可以使用：在配置类中加入@EnabledConfigurationProperties+@ConfigurationProperties
@ConfigurationProperties(prefix = "mycar")
public class Car {
    /**
     * 品牌
     */
    private String brand;
    /**
     * 价格
     */
    private int price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
