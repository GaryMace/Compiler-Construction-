/* Generated By:JJTree: Do not edit this line. ASTGRTNComp.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package Assignment3;public
class ASTGRTNComp extends SimpleNode {
  private String name;
  public ASTGRTNComp(int id) {
    super(id);
  }

  public ASTGRTNComp(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
  public void setName(String s) {
    this.name =s;
  }
  public String getName() {
    return this.name;
  }
}
/* JavaCC - OriginalChecksum=252eddb42d940ab464f519197023afe0 (do not edit this line) */
