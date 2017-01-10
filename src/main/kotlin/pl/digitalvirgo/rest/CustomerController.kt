package pl.digitalvirgo.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import pl.digitalvirgo.dao.repositories.CustomerRepository

/**
 * Created by tsieciechowicz on 10.01.2017.
 */
@RestController
class CustomerController (val repository: CustomerRepository) {

    @GetMapping("/")
    fun findAll() = repository.findAll()

    @GetMapping("/{name}")
    fun findByLastName(@PathVariable name:String)
            = repository.findByLastName(name)
}