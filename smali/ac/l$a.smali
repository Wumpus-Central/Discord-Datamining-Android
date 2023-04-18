.class Lac/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lac/l$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lac/l;->e(Lac/c;)Lac/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lac/c;


# direct methods
.method constructor <init>(Lac/c;)V
    .locals 0

    iput-object p1, p0, Lac/l$a;->a:Lac/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lac/l;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lac/l$a;->b(Lac/l;Ljava/lang/CharSequence;)Lac/l$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Lac/l;Ljava/lang/CharSequence;)Lac/l$b;
    .locals 1

    new-instance v0, Lac/l$a$a;

    invoke-direct {v0, p0, p1, p2}, Lac/l$a$a;-><init>(Lac/l$a;Lac/l;Ljava/lang/CharSequence;)V

    return-object v0
.end method
