package lessons.lesson15.homeworks

open class Shape() {}
class Circle : Shape() {}
open class Geometric : Shape() {}
class Quadrangle : Geometric() {}
class Triangle : Geometric() {}

open class Education()
open class School: Education(){}
class EngineerSchool: School(){}


open class Furniture(){}
open class SoftFurniture(): Furniture(){}
class Chair: SoftFurniture(){}
