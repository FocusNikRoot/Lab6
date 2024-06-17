package com.example.mobilelab2_6

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int

public class FirstFragmentDirections private constructor() {
  private data class ActionFirstFragmentToSecondFragment3(
    public val number: Int = 2,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_firstFragment_to_secondFragment3

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("number", this.number)
        return result
      }
  }

  public companion object {
    public fun actionFirstFragmentToSecondFragment3(number: Int = 2): NavDirections =
        ActionFirstFragmentToSecondFragment3(number)
  }
}
