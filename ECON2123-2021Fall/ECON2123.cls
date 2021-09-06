\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{ECON2123}

\DeclareOption*{%
  \PassOptionsToClass{\CurrentOption}{notes}%
}

\ProcessOptions

\LoadClass{notes}

\def\coursenumber{ECON 2123}
\def\coursename{Macroeconomics}
\def\coursesemester{Fall 2021}
\def\author{Ljm}