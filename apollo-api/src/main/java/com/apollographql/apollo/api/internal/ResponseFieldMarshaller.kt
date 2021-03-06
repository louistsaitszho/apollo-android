package com.apollographql.apollo.api.internal

interface ResponseFieldMarshaller {
  fun marshal(writer: ResponseWriter)

  companion object {
    @JvmSynthetic
    inline operator fun invoke(crossinline block: (ResponseWriter) -> Unit) = object : ResponseFieldMarshaller {
      override fun marshal(writer: ResponseWriter) {
        block(writer)
      }
    }
  }
}
