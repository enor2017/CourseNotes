\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{COMP3021}

\DeclareOption*{%
  \PassOptionsToClass{\CurrentOption}{notes}%
}

\ProcessOptions

\LoadClass{notes}

\def\coursenumber{COMP 3021}
\def\coursename{Java Programming}
\def\coursesemester{Fall 2021}
\def\author{Ljm}