from typing import List


class Solution:

  def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
    cars = sorted(zip(position, speed), reverse=True)
    stack: List[float] = []

    for pos, spd in cars:
      time = (target - pos) / spd
      stack.append(time)
      # If this car arrives at or before the fleet ahead, it merges into it
      if len(stack) >= 2 and stack[-1] <= stack[-2]:
        stack.pop()

    return len(stack)