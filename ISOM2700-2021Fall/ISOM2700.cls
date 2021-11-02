\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{ISOM2700}

\DeclareOption*{%
  \PassOptionsToClass{\CurrentOption}{notes}%
}

\ProcessOptions

\LoadClass{notes}

\def\coursenumber{ISOM 2700}
\def\coursename{Operations Management}
\def\coursesemester{Fall 2021}
\def\author{Ljm}