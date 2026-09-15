package hello

class Maintest extends munit.FunSuite:
  test("hello message"):
    assertEquals(helloMessage, "Hello, native world!")
