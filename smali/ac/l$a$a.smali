.class Lac/l$a$a;
.super Lac/l$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lac/l$a;->b(Lac/l;Ljava/lang/CharSequence;)Lac/l$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic r:Lac/l$a;


# direct methods
.method constructor <init>(Lac/l$a;Lac/l;Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Lac/l$a$a;->r:Lac/l$a;

    invoke-direct {p0, p2, p3}, Lac/l$b;-><init>(Lac/l;Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method f(I)I
    .locals 0

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method g(I)I
    .locals 2

    iget-object v0, p0, Lac/l$a$a;->r:Lac/l$a;

    iget-object v0, v0, Lac/l$a;->a:Lac/c;

    iget-object v1, p0, Lac/l$b;->m:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, p1}, Lac/c;->d(Ljava/lang/CharSequence;I)I

    move-result p1

    return p1
.end method
