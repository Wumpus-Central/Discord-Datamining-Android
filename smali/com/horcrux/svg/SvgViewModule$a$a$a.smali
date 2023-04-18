.class Lcom/horcrux/svg/SvgViewModule$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/horcrux/svg/SvgViewModule$a$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Lcom/horcrux/svg/SvgViewModule$a$a;


# direct methods
.method constructor <init>(Lcom/horcrux/svg/SvgViewModule$a$a;)V
    .locals 0

    iput-object p1, p0, Lcom/horcrux/svg/SvgViewModule$a$a$a;->k:Lcom/horcrux/svg/SvgViewModule$a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/horcrux/svg/SvgViewModule$a$a$a;->k:Lcom/horcrux/svg/SvgViewModule$a$a;

    iget-object v0, v0, Lcom/horcrux/svg/SvgViewModule$a$a;->k:Lcom/horcrux/svg/SvgViewModule$a;

    iget v1, v0, Lcom/horcrux/svg/SvgViewModule$a;->k:I

    iget-object v2, v0, Lcom/horcrux/svg/SvgViewModule$a;->l:Lcom/facebook/react/bridge/ReadableMap;

    iget-object v3, v0, Lcom/horcrux/svg/SvgViewModule$a;->m:Lcom/facebook/react/bridge/Callback;

    iget v0, v0, Lcom/horcrux/svg/SvgViewModule$a;->n:I

    add-int/lit8 v0, v0, 0x1

    invoke-static {v1, v2, v3, v0}, Lcom/horcrux/svg/SvgViewModule;->access$000(ILcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;I)V

    return-void
.end method
