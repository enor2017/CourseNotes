\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{MATH2421}

\DeclareOption*{%
  \PassOptionsToClass{\CurrentOption}{notes}%
}

\ProcessOptions

\LoadClass{notes}

\def\coursenumber{MATH 2421}
\def\coursename{Probability}
\def\coursesemester{Fall 2021}
\def\author{Ljm}