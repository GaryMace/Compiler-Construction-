package Assignment3;

/* Generated By:JJTree: Do not edit this line. ASTBlock.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public class ASTBlock extends SimpleNode {
  public ASTBlock(int id) {
    super(id);
  }

  public ASTBlock(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=df973dd44a4f61fe7f537d57c04506db (do not edit this line) */
