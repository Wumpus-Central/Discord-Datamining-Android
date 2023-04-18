.class public final synthetic Lv/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/r0$b;


# instance fields
.field public final synthetic a:Lv/k$a;

.field public final synthetic b:Lw/r0;


# direct methods
.method public synthetic constructor <init>(Lv/k$a;Lw/r0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv/j;->a:Lv/k$a;

    iput-object p2, p0, Lv/j;->b:Lw/r0;

    return-void
.end method


# virtual methods
.method public final a(Lw/r0$a;)Z
    .locals 2

    iget-object v0, p0, Lv/j;->a:Lv/k$a;

    iget-object v1, p0, Lv/j;->b:Lw/r0;

    invoke-static {v0, v1, p1}, Lv/k$a;->a(Lv/k$a;Lw/r0;Lw/r0$a;)Z

    move-result p1

    return p1
.end method
