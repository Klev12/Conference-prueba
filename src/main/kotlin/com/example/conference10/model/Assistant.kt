package com.example.conference10.model

import jakarta.persistence.*

@Entity
@Table(name = "Assistant")
class Assistant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    var id: Long? = null
    var fullname: String? = null
    var rols: String? = null
    var age: Int? = null
    @Column(name = "Conference_id")
    var conferenceid: Long? = null
}