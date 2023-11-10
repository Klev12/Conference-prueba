package com.example.conference10.model

import jakarta.persistence.*

@Entity
@Table(name = "Conference")
class Conference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    var id: Long? = null
    var title: String? = null
    var description: String? = null
    var city: String? = null
    @Column(name = "total_attendants")
    var totalAssistants: Int? = null
}