.class final Lw9/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw9/o$a;


# instance fields
.field final synthetic a:Lu9/j;


# direct methods
.method constructor <init>(Lu9/j;)V
    .locals 0

    iput-object p1, p0, Lw9/l0;->a:Lu9/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lu9/k;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lw9/l0;->a:Lu9/j;

    invoke-virtual {v0, p1}, Lu9/j;->b(Lu9/k;)V

    iget-object p1, p0, Lw9/l0;->a:Lu9/j;

    return-object p1
.end method
