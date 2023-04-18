.class Landroidx/dynamicanimation/animation/a$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/dynamicanimation/animation/a$d;-><init>(Landroidx/dynamicanimation/animation/a$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Landroidx/dynamicanimation/animation/a$d;


# direct methods
.method constructor <init>(Landroidx/dynamicanimation/animation/a$d;)V
    .locals 0

    iput-object p1, p0, Landroidx/dynamicanimation/animation/a$d$a;->k:Landroidx/dynamicanimation/animation/a$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public doFrame(J)V
    .locals 0

    iget-object p1, p0, Landroidx/dynamicanimation/animation/a$d$a;->k:Landroidx/dynamicanimation/animation/a$d;

    iget-object p1, p1, Landroidx/dynamicanimation/animation/a$c;->a:Landroidx/dynamicanimation/animation/a$a;

    invoke-virtual {p1}, Landroidx/dynamicanimation/animation/a$a;->a()V

    return-void
.end method
