
def sample(x: String): Map[String, String] = {
  x.split(";").
    map(x => x.split("=")).
    map { case Array(k,v) => (k, v)}.
    toMap
}

sample("a=ab;b=cd;c=de")