package com.example.androidlearning

class Sock {
    var color = "red"

    fun changeColor(color: String) {
        this.color = color
    }

    companion object {
        fun withColor(color: String): Sock {
            val sock = Sock()
            sock.changeColor(color)
            return sock
        }
    }
}

class ClassInstanceDemo {
    fun test() {
        val sockWithoutCompanion = Sock()
        sockWithoutCompanion.changeColor("blue")

        val sock1 = Sock.withColor("green")
        val sock2 = Sock.withColor("yellow")

        println(sockWithoutCompanion.color)
        println(sock2.color)
        println(sock1.color)
    }
}