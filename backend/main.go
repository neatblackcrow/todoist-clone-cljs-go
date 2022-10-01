package main

import (
    "github.com/gin-gonic/gin"
    "net/http"
)

func main() {
    r := gin.Default()
    r.GET("/ping", func(c *gin.Context) {
        c.JSON(http.StatusOK, gin.H {
		"message": "pong",
	    })
    })
    r.Run() // Default listen on 0.0.0.0:8080
}
