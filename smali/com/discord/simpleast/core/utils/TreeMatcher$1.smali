.class Lcom/discord/simpleast/core/utils/TreeMatcher$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/simpleast/core/utils/NodeProcessor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/simpleast/core/utils/TreeMatcher;->matches(Ljava/util/List;Ljava/util/List;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/discord/simpleast/core/utils/TreeMatcher;

.field final synthetic val$tree1PostOrder:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/discord/simpleast/core/utils/TreeMatcher;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/simpleast/core/utils/TreeMatcher$1;->this$0:Lcom/discord/simpleast/core/utils/TreeMatcher;

    iput-object p2, p0, Lcom/discord/simpleast/core/utils/TreeMatcher$1;->val$tree1PostOrder:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public processNode(Lcom/discord/simpleast/core/node/Node;)V
    .locals 1

    iget-object v0, p0, Lcom/discord/simpleast/core/utils/TreeMatcher$1;->val$tree1PostOrder:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
