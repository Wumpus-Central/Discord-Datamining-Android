.class Landroidx/dynamicanimation/animation/DynamicAnimation$f;
.super Lj1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/dynamicanimation/animation/DynamicAnimation;-><init>(Lj1/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lj1/b;

.field final synthetic c:Landroidx/dynamicanimation/animation/DynamicAnimation;


# direct methods
.method constructor <init>(Landroidx/dynamicanimation/animation/DynamicAnimation;Ljava/lang/String;Lj1/b;)V
    .locals 0

    iput-object p1, p0, Landroidx/dynamicanimation/animation/DynamicAnimation$f;->c:Landroidx/dynamicanimation/animation/DynamicAnimation;

    iput-object p3, p0, Landroidx/dynamicanimation/animation/DynamicAnimation$f;->b:Lj1/b;

    invoke-direct {p0, p2}, Lj1/a;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)F
    .locals 0

    iget-object p1, p0, Landroidx/dynamicanimation/animation/DynamicAnimation$f;->b:Lj1/b;

    invoke-virtual {p1}, Lj1/b;->a()F

    move-result p1

    return p1
.end method

.method public b(Ljava/lang/Object;F)V
    .locals 0

    iget-object p1, p0, Landroidx/dynamicanimation/animation/DynamicAnimation$f;->b:Lj1/b;

    invoke-virtual {p1, p2}, Lj1/b;->b(F)V

    return-void
.end method
