/* Generated By:JJTree: Do not edit this line. ASTBindingsClause.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.bigdata.rdf.sail.sparql.ast;

public
class ASTBindingsClause extends SimpleNode {
  public ASTBindingsClause(int id) {
    super(id);
  }

  public ASTBindingsClause(SyntaxTreeBuilder p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SyntaxTreeBuilderVisitor visitor, Object data) throws VisitorException {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=264ad0cf52c8947dad321024745b856f (do not edit this line) */
