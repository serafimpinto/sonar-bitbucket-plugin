import ch.mibex.bitbucket.sonar.diff.GitDiffParser._
  "diff headers mode" should {
  }

  "diff headers copy" should {

  }

  "diff headers rename and similarity" should {
          index = Option(Index(fromHash = "f3e63d7", toHash = "e8f44ba", mode = Some(100644)))
          index = Option(Index(fromHash = "f3e63d7", toHash = "e8f44ba", mode = Some(100644))))
            index = Option(Index(fromHash = "57b70a8", toHash = "fc8f0d5", mode = Option(100755)))),
            index = Option(Index(fromHash = "4545ecc", toHash = "0000000", mode = None))),
            index = Option(Index(fromHash = "356f4b7", toHash = "f5b8743", mode = Some(100755)))),
            index = Option(Index(fromHash = "f3e63d7", toHash = "e8f44ba", mode = Some(100644)))),
    "Github issue #8" in {
      allDiffs must succeedOn(StringUtils.readFile("/diffs/github#8.txt"))
    }

    "Github issue #8 no newline at eof" in {
      allDiffs must succeedOn(StringUtils.readFile("/diffs/github#8-no-newline-at-eof.txt"))
    }

    "Github issue #8 wrong example 1" in {
      allDiffs must succeedOn(StringUtils.readFile("/diffs/github#8-diff-wrong1.txt"))
    }

    "Github issue #8 wrong example 3" in {
      allDiffs must succeedOn(StringUtils.readFile("/diffs/github#8-diff-wrong3.txt"))
    }

    "Github issue #8 wrong example 4" in {
      allDiffs must succeedOn(StringUtils.readFile("/diffs/github#8-diff-wrong4.txt"))
    }

    "Github issue #10 no index existing" in {
      allDiffs must succeedOn(StringUtils.readFile("/diffs/github#10-no-index.txt"))
    }

    "Github issue #8 failing diff" in {
      allDiffs must succeedOn(StringUtils.readFile("/diffs/failing-diff.txt")).withResult(
        List(
          GitDiff(
            FileChange("dev/bin/custom/connector/project.properties",
                       "dev/bin/custom/connector/project.properties"),
            ExtendedDiffHeader(List(NewFileMode(100644)), Option(Index("0000000", "a244253", None))),
            List(
              Hunk(
                HunkHeader(FromToRange(0, 0, 1, 5), None),
                List(
                  AddedLine(""),
                  AddedLine("lorealprotogoconnector.key=value"),
                  AddedLine(""),
                  AddedLine("# Specifies the location of the spring context file"),
                  AddedLine("connector.application-context=connector-spring.xml"),
                  CtxLine("\\ No newline at end of file")
                )
              )
            )
          )
        )
      )
    }

            header = ExtendedDiffHeader(List(DeletedFileMode(100644)), Option(Index("27e8967", "0000000", None))),
              List(NewFileMode(100644)),Option(Index("0000000","a54bbbb",None))