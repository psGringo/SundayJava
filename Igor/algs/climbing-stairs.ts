// https://leetcode.com/problems/climbing-stairs/

function climbStairs(n: number): number {
  return fib(n);
}

function fib(n: number): number {
  let prev = 0;
  let current = 1;

  for (let i = current; i <= n; i++) {
    let next = prev + current;
    prev = current;
    current = next;
  }

  return current;
}
