package com.example.mobilelab2_6

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class secondFragmentDirections private constructor() {
  public companion object {
    public fun actionSecondFragmentToFirstFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_secondFragment_to_firstFragment2)
  }
}
