\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{MATH2023}

\DeclareOption*{%
  \PassOptionsToClass{\CurrentOption}{notes}%
}

\ProcessOptions

\LoadClass{notes}

\def\coursenumber{MATH 2023}
\def\coursename{Multivariable Calculus}
\def\coursesemester{Fall 2021}
\def\author{Ljm}