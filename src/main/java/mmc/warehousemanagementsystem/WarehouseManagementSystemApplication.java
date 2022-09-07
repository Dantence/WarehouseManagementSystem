package mmc.warehousemanagementsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("mmc.warehousemanagementsystem.mapper")
public class WarehouseManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(WarehouseManagementSystemApplication.class, args);
    }

}
