package com.example.pr19_1_voroshilov

import java.util.Date
import java.util.UUID

data class Crime (val id: UUID = UUID.randomUUID(), val date: Date){
    var title = ""
    var isSolved = false
}