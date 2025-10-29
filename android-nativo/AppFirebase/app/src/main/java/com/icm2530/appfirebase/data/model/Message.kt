package com.icm2530.appfirebase.data.model

import com.google.firebase.firestore.ServerTimestamp
import java.util.Date // Usamos Date con @ServerTimestamp

data class Message(
    val id: String = "", // Firestore asignará un ID si usamos .add()
    val text: String = "",
    val senderId: String = "", // UID del usuario que envía
    @ServerTimestamp // Firestore asignará la hora del servidor automáticamente
    val timestamp: Date? = null // Firestore convertirá esto a Timestamp internamente
) {
    // Constructor sin argumentos requerido por Firestore para toObjects()
    constructor() : this("", "", "", null)
}