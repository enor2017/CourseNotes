\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{COMP3711}

\DeclareOption*{%
  \PassOptionsToClass{\CurrentOption}{notes}%
}

\ProcessOptions

\LoadClass{notes}

\def\coursenumber{COMP 3711}
\def\coursename{Design \& Analysis of Algorithms}
\def\coursesemester{Fall 2021}
\def\author{Ljm}