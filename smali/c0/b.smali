.class public final synthetic Lc0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic k:Lc0/c;


# direct methods
.method public synthetic constructor <init>(Lc0/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc0/b;->k:Lc0/c;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lc0/b;->k:Lc0/c;

    check-cast p1, Lw/w0;

    check-cast p2, Lw/w0;

    invoke-static {v0, p1, p2}, Lc0/c;->a(Lc0/c;Lw/w0;Lw/w0;)I

    move-result p1

    return p1
.end method
