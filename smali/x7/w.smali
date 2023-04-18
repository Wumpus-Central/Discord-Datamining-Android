.class public final synthetic Lx7/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic k:Lx7/x$g;


# direct methods
.method public synthetic constructor <init>(Lx7/x$g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx7/w;->k:Lx7/x$g;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lx7/w;->k:Lx7/x$g;

    invoke-static {v0, p1, p2}, Lx7/x;->d(Lx7/x$g;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
