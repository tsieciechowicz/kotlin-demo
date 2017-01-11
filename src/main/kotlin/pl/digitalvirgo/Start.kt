package pl.digitalvirgo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import pl.digitalvirgo.dao.entity.Customer

/**
 * Created by tsieciechowicz on 10.01.2017.
 */
@SpringBootApplication
class Demo

fun main(args: Array<String>){
    SpringApplication.run(Demo::class.java, *args)
}
