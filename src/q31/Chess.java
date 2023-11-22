package q31;
@ChessRule(moves = "forward")
@ChessRule(name = "Knights", moves = {"L Shape"}) //Line n2
@ChessRule(name = "Bishop", moves = {"Diagonal Lines", "In any direction"}) //Line n3
@ChessRule(moves = {"Diagonal Lines", "In any direction"}, name = "Queen") //Line n4
@ChessRule(name = "Queen", moves = {"forward", "backward"}) //Line n5
public class Chess {
}
