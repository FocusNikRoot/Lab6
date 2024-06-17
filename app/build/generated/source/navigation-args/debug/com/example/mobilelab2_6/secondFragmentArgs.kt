package com.example.mobilelab2_6

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class secondFragmentArgs(
  public val number: Int = 2,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("number", this.number)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("number", this.number)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): secondFragmentArgs {
      bundle.setClassLoader(secondFragmentArgs::class.java.classLoader)
      val __number : Int
      if (bundle.containsKey("number")) {
        __number = bundle.getInt("number")
      } else {
        __number = 2
      }
      return secondFragmentArgs(__number)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): secondFragmentArgs {
      val __number : Int?
      if (savedStateHandle.contains("number")) {
        __number = savedStateHandle["number"]
        if (__number == null) {
          throw IllegalArgumentException("Argument \"number\" of type integer does not support null values")
        }
      } else {
        __number = 2
      }
      return secondFragmentArgs(__number)
    }
  }
}
