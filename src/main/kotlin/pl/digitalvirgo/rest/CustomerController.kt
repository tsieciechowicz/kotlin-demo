package pl.digitalvirgo.rest

import org.springframework.web.bind.annotation.*
import pl.digitalvirgo.dao.entity.Customer
import pl.digitalvirgo.dao.repositories.CustomerRepository
import pl.digitalvirgo.dao.repositories.ProductRepository
import java.util.logging.Logger

/**
 * Created by tsieciechowicz on 10.01.2017.
 */
@RestController("/customer")
class CustomerController (val customerRepository: CustomerRepository, val productRepository: ProductRepository ) {

    val log = LoggingFactory.getLogger("com.example.app")

    @GetMapping("/")
    fun findAll() = customerRepository.findAll()

    @GetMapping("/name/{name}")
    fun findByName(@PathVariable name:String) {
         Logger.getLogger("")
    }
            = customerRepository.findByName(name)

    @PostMapping("/save")
    fun save(@RequestBody customer: Customer)
            = customerRepository.save(customer)

    @PostMapping("/update")
    fun update(@RequestBody customer: Customer)
            = customerRepository.save(customer)

    @PostMapping("/delete")
    fun delete(@RequestBody customer: Customer)
            = customerRepository.delete(customer.id)
}