package pl.digitalvirgo.dao.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by tsieciechowicz on 09.01.2017.
 */
@Entity(name = "customers")
data class Customer(@Id @GeneratedValue(strategy = GenerationType.AUTO) var  id: Long=0, var name: String="")

@Entity(name = "products")
data class Product(@Id @GeneratedValue(strategy = GenerationType.AUTO) var  id: Long=0, var name: String="")
