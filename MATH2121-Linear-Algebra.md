# MATH2121 Linear Algebra

[toc]

## Systems of linear equations

### Basis

- **linear equation:** $\sum_{i=1}^na_ix_i=b$.
- $0=0, 1=1$ are both linear equations.(*false* eq is still an eq.)
- $\sqrt{x_1^2}=x_2$ is **not** linear eq, since $\sqrt{x_1^2}=|x_1|$.
- **system of linear equation**, or **linear system**: a list of linear eqs.

### Solution of linear system

- A **solution** of a linear system: a list of $n$ numbers $(s_1,s_2,\cdots,s_n)$ with the property that if we set all $x_i=s_i$, we get all true statements.

- **nonzero solution:** at least one $s_i\ne 0$

- **equivalent** linear systems: have the same **set of** solutions.

  <font color=red>[Attention] the same **set of solutions** means **all** solutions are equal</font>

- **Theorem:** A linear system is either **consistent** (has 1 or infinitely many solutions), or **inconsistent** (has 0 solutions).

  - Proof by geometry: *Find common intersections of n lines*, they have 0, 1, or infinitely many intersections.

  - Proof by algebra: *Only need to prove if one linear system has 2 diffierent sols, then it has infinitely many sols.* Why?

    - Let $(s_1,s_2,\cdots, s_n)$ be one solution of $\sum_{i=1}^na_ix_i=b$,

      $(t_1,t_2,\cdots,t_n)$ be one solution of $\sum_{i=1}^na_ix_i=0$ (*homogeneous system*)

    - As long as the HS has a nonzero solution $(t_1,t_2,\cdots,t_n)$ , then there're infinitely many solutions: $(s_1+kt_1, s_2+kt_2,\cdots,s_n+kt_n)$.
    - Back to original eqs, if the system have 2 different solutions $(s_1,s_2,\cdots, s_n)$, $(r_1,r_2,\cdots, r_n)$, then $(t_1,t_2,\cdots,t_n)=(s_1-r_1,s_2-r_2,\cdots, s_n-r_n)$ must be a **nonzero solution** of HS.

## Matrices

### Basis

$A=\left[ \begin{matrix} A_{11}&A_{12}&A_{13}&A_{14}\\A_{21}&A_{22}&A_{23}&A_{24}\\A_{31}&A_{32}&A_{33}&A_{34} \end{matrix} \right]$

- $m\times n$: $m$ rows, $n$ columns.

- the **coefficient matrix** of a linear system:

  $\begin{align*}x_1-2x_2+x_3&=0\\2x_2-8x_3&=0\\5x_1-5x_3&=10 \end{align*} \rightarrow \left[\begin{matrix}1&-2&1\\0&2&-8\\5&0&-5\end{matrix}\right]$

- the **augmented matrix** of the system above:

  $\left[\begin{matrix}1&-2&1&0\\0&2&-8&8\\5&0&-5&10\end{matrix}\right]$, or sometimes, $\left[\begin{matrix}1&-2&1\\0&2&-8\\5&0&-5\end{matrix}\right|\left. \begin{matrix} 0\\8\\10\end{matrix}\right]$

### Solving linear systems

Example: 

$\left[\begin{matrix}1&-2&1\\0&2&-8\\5&0&-5\end{matrix}\right|\left. \begin{matrix} 0\\8\\10\end{matrix}\right] \sim \left[\begin{matrix}1&-2&1\\0&2&-8\\0&10&-10\end{matrix}\right|\left. \begin{matrix} 0\\8\\10\end{matrix}\right] \sim \left[\begin{matrix}1&-2&1\\0&1&-4\\0&10&-10\end{matrix}\right|\left. \begin{matrix} 0\\4\\10\end{matrix}\right] \sim \left[\begin{matrix}1&-2&1\\0&1&-4\\0&0&30\end{matrix}\right|\left. \begin{matrix} 0\\4\\-30\end{matrix}\right] \sim\left[\begin{matrix}1&-2&1\\0&1&-4\\0&0&1\end{matrix}\right|\left. \begin{matrix} 0\\4\\-1\end{matrix}\right]$

- last system is **triangular**: all entries $(i,j)$ with $i>j$ are zero.
- solve **from the bottom up**.
- **row operations**:
  - **Replacement**: replace one row by the *sum* of itself and a multiple of *another* row.
  - **Scaling:** multiply a row by a *nonzero* number.
  - **Interchange**: *swap* two rows.
- If the augmented matrices of 2 linear systems are **row equivalent**, then the systems are equivalant.(*have same solutions*)

### Row reduction to echelon form

- **Why**? To determine whether a linear system has 0, 1, or infinitely many solutions.

- **leading entry**: the first *nonzero* entry from left to right.
- **echelon form:**
  - If a row is **zero**, it must be at bottom.
  - The leading entry in a nonzero row lies in a column to the right of the leading entry in the row above. (If a row is nonzero, then every entry **below** its leading entry in the same column is zero)
- **reduced echelon form**:
  - The matrix is in **echelon form**.
  - 







